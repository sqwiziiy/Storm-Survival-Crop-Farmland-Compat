# Manual test plan

Use a dedicated 1.20.1 Fabric instance containing Fabric API 0.92.12, the
three tested mods, this JAR, and the existing Farmland Compat datapack.

For each crop below, place it on vanilla farmland, Farm & Charm fertilized
farmland, RU peat farmland, and RU silt farmland (for HerbalBrews also record
whether fertilized farmland is supported by the installed version):

`barley`, `corn`, `lettuce`, `oat`, `onion`, `strawberry`, `coffee`, `rooibos`,
`tea`, `yerba mate`.

For every soil/crop pair verify: planting, a neighbor update, natural random
tick growth, bonemeal where supported, break/replant, and persistence across a
server restart. The completed validation result for this release is `PASS`:
all 20 targeted RU placements passed, including neighbor updates and the
remaining lifecycle checks.

Completed companion/regression results:

- Tomato: `PASS_WITH_DATAPACK`
- Brewery hops regression: `PASS`
- Representative vanilla farmland regression: `PASS`
- Farm & Charm fertilized farmland: `PASS`
- Natural growth on peat and silt: `PASS`
- Moisture runtime: `FUNCTIONAL_PASS`
- Bonemeal: `PASS`
- Restart persistence: `PASS`
- Unrelated CropBlock behavior: `UNCHANGED`

`FUNCTIONAL_PASS` records functional dry/hydrated behavior without crashes or
obvious incorrect growth. It does not claim an exact quantitative growth-rate
benchmark.
