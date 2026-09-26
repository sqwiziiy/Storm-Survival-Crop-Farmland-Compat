# Storm Survival Crop Farmland Compat

Adds Regions Unexplored peat and silt farmland support for selected Farm &
Charm and HerbalBrews crops on Minecraft 1.20.1.

This is a server-side compatibility mod. A client copy is optional, but
recommended so local placement prediction matches the server. It adds no
blocks, items, assets, or custom growth bonus.

## Supported crops

Farm & Charm:

- `farm_and_charm:barley_crop`
- `farm_and_charm:corn_crop`
- `farm_and_charm:lettuce_crop`
- `farm_and_charm:oat_crop`
- `farm_and_charm:onion_crop`
- `farm_and_charm:strawberry_crop`
- `farm_and_charm:tomato`

HerbalBrews:

- `herbalbrews:coffee_plant`
- `herbalbrews:rooibos_plant`
- `herbalbrews:tea_plant`
- `herbalbrews:yerba_mate_plant`

Supported RU farmland:

- `regions_unexplored:peat_farmland`
- `regions_unexplored:silt_farmland`

Existing `minecraft:farmland` and
`farm_and_charm:fertilized_farmland` behavior remains supported.

The implementation uses narrow vanilla `CropBlock#canPlantOnTop` and
`CropBlock#getAvailableMoisture` hooks for the explicit allowlist. It does not
globally modify unrelated crops, Vinery grapes, recipes, seasons, worldgen, or
growth rates.

## Installation

Install on the server with Fabric for Minecraft 1.20.1. The tested Java
version is 17.

## Tested with

- Minecraft 1.20.1
- Fabric
- Fabric API 0.92.12+1.20.1
- Regions Unexplored 0.5.6+1.20.1
- [Let's Do] Farm & Charm 1.0.14
- [Let's Do] HerbalBrews 1.0.12
- Storm Survival Farmland Compat 0.1.0+mc1.20.1

Nearby versions may work, but are not guaranteed.

## Companion datapack

Brewery hops remain handled separately by [Storm Survival Farmland Compat](https://github.com/sqwiziiy/storm-survival-farmland-compat).

Farm & Charm 1.0.14 hard-codes vanilla and fertilized farmland in
`TomatoCropBlock.mayPlaceOn`, so tomato support is code-side here. The tomato
rope/body/head mechanics are not replaced.

The datapack and this mod solve different farmland compatibility paths and are
designed to be used together.

## Validation

- Dedicated Fabric server launch: PASS
- RU placement matrix: 20/20 PASS
- Natural growth: PASS
- Moisture behavior: FUNCTIONAL_PASS
- Bonemeal: PASS
- Restart persistence: PASS
- Existing vanilla/fertilized farmland behavior: PASS
- Brewery hops datapack regression: PASS

Exact quantitative growth rates were not benchmarked; `FUNCTIONAL_PASS` means
natural growth and dry/hydrated farmland behavior were verified without crashes
or obvious incorrect growth behavior.

## Scope exclusions

- Brewery hops are handled by the companion datapack.
- Farm & Charm tomato uses the narrow code-side placement fix described above.
- Vinery grape crops and unrelated vanilla/modded `CropBlock` crops are out of scope.

No third-party assets or binaries are bundled. License: MIT.

Build with Java 17 using `./gradlew clean build`. The output is a normal Fabric
mod JAR; no third-party assets, binaries, or source are bundled.
