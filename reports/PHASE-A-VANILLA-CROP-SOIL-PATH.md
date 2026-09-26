# Phase A — vanilla CropBlock soil-path audit

Target mappings: Minecraft 1.20.1, Yarn `1.20.1+build.10`.

Verified remapped descriptors from the built refmap:

- `CropBlock#canPlantOnTop(BlockState, BlockView, BlockPos):Z`
  (`method_9695`)
- `CropBlock#getAvailableMoisture(Block, BlockView, BlockPos):F`
  (`method_9830`)
- `BlockState#isOf(Block):Z` (`method_27852`)

## Audited paths

- `net.minecraft.block.CropBlock#canPlantOnTop(BlockState, BlockView, BlockPos)`
  returns true for the vanilla `Blocks.FARMLAND` identity. `PlantBlock`'s
  placement/survival path calls this predicate, so the placement hook is the
  narrow compatibility point.
- `net.minecraft.block.PlantBlock#canPlaceAt(BlockState, WorldView, BlockPos)`
  delegates soil validity to `canPlantOnTop`; no second direct farmland check
  is needed for neighbor-update survival.
- `net.minecraft.block.CropBlock#randomTick(BlockState, ServerWorld, BlockPos,
  Random)` calls `CropBlock#getAvailableMoisture(Block, BlockView, BlockPos)`
  before calculating the vanilla random growth chance.
- `CropBlock#getAvailableMoisture(Block, BlockView, BlockPos)` uses
  `BlockState#isOf(Block)` for farmland identity and reads
  `FarmlandBlock#MOISTURE` for hydrated weighting. This is the growth-side
  direct check that would otherwise make RU farmland contribute no farmland
  weight.
- Bonemeal uses the normal `Fertilizable` path and does not perform a separate
  RU-excluding soil identity check after the crop is present.

## Implementation consequence

`CropBlockMixin` injects `canPlantOnTop` for only the ten verified registry IDs.
It also redirects the farmland identity test inside `getAvailableMoisture`.
The redirect leaves the subsequent `MOISTURE` property read untouched, so it
preserves vanilla hydrated-vs-dry behavior for RU blocks that expose the same
vanilla moisture property. The exact installed RU classes should still be
checked in a runtime instance before marking the manual matrix complete.
