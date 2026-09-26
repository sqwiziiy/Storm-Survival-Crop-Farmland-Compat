# Phase C — mixin compatibility

This project has one mixin target: vanilla `CropBlock`.

- `canPlantOnTop` is an inject-at-head, cancellable predicate. It returns true
  only for an allowlisted crop and one of the four exact soil IDs; otherwise
  vanilla continues unchanged.
- `getAvailableMoisture` has one narrow `BlockState.isOf(Block)` redirect. It
  treats the compatible soil as farmland only when the vanilla comparison is
  specifically against `Blocks.FARMLAND`. No growth chance or multiplier is
  invented.

Farm & Charm's installed mixin also participates in CropBlock behavior for
fertilized farmland. This mod does not overwrite that method or replace its
fertilized-soil handling. If both mixins target the same moisture method,
Mixin application order can affect which redirect sees the call. The helper
is idempotent for vanilla farmland and the placement hook is idempotent for
fertilized farmland; a real modpack launch remains required to confirm the
exact order and behavior.

`TOMATO_CODE_PATH = LIKELY_SUPPORTED_BY_DATAPACK`: tomato is intentionally
not included because its custom rope/body/head code already checks the Farm &
Charm farmland tag in the relevant path. This is not a manual gameplay claim.
