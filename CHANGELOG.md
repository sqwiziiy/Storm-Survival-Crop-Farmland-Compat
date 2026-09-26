# Changelog

## 0.2.0+mc1.20.1

Adds Farm & Charm tomato compatibility with Regions Unexplored peat and silt farmland.

Existing ordinary Farm & Charm and HerbalBrews crop compatibility is unchanged.

Validated on Minecraft 1.20.1 with:

- Regions Unexplored 0.5.6+1.20.1
- Farm & Charm 1.0.14
- HerbalBrews 1.0.12

Manual runtime validation passed for:

- tomato on peat farmland
- tomato on silt farmland
- tomato on vanilla farmland
- tomato on fertilized farmland
- Brewery hops regression on peat/silt
- representative ordinary crop regression on peat/silt

Brewery hops remain handled by the separate Storm Survival Farmland Compat datapack.

## 0.1.0+mc1.20.1

Initial public release.

### Added

- Regions Unexplored peat farmland support for six targeted Farm & Charm crops.
- Regions Unexplored silt farmland support for six targeted Farm & Charm crops.
- Regions Unexplored peat/silt support for HerbalBrews coffee, rooibos, tea and yerba mate.
- Targeted vanilla CropBlock moisture/growth compatibility.

### Validation

- Clean build: PASS
- Dedicated Fabric server launch: PASS
- RU crop placement matrix: 20/20 PASS
- Natural growth: PASS
- Bonemeal: PASS
- Restart persistence: PASS
- Existing vanilla/fertilized farmland behavior: PASS
- Brewery hops datapack regression: PASS
