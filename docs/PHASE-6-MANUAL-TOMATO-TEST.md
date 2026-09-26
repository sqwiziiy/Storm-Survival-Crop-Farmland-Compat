# Phase 6 — manual tomato runtime validation

Use the disposable Prism instance:

`/home/mentality/.var/app/org.prismlauncher.PrismLauncher/data/PrismLauncher/instances/storm-survival-0.1.0-dev+mc1.20.1`

## Startup checks

- [ ] Game reaches the main menu without a compat-mod crash.
- [ ] A test world loads successfully.
- [x] The loaded mod list/log shows `storm_survival_crop_farmland_compat` version `0.2.0+mc1.20.1`.
- [x] Paxi is enabled and the Farmland Compat datapack remains active.

## Crop matrix

- [x] Farm & Charm tomato grows on RU peat farmland.
- [x] Farm & Charm tomato grows on RU silt farmland.
- [x] Farm & Charm tomato still grows on vanilla farmland.
- [x] Farm & Charm tomato still grows on fertilized farmland.
- [x] Brewery hops still grow on RU peat and RU silt farmland.
- [x] One representative ordinary `CropBlock` crop grows on RU peat and RU silt farmland.

## Tomato placement note

Farm & Charm tomato validation used the valid complete setup from Phase 5: the tomato body/stem was planted on a valid farmland block, with the required rope/trellis support and tomato head/body arrangement. A bare right-click on farmland is not a valid tomato test.

Confirmed manual result: `TOMATO_RUNTIME_GATE = PASS`.
