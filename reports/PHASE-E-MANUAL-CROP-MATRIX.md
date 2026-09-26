# Phase E — manual crop matrix

`MANUAL_VALIDATION = PASS`

The user completed the real Minecraft 1.20.1 manual validation in the tested
Storm Survival environment. All requested checks passed.

## RU placement matrix

`20/20 PASS`

| Crop | Peat | Silt |
|---|---|---|
| Farm & Charm barley | PASS | PASS |
| Farm & Charm corn | PASS | PASS |
| Farm & Charm lettuce | PASS | PASS |
| Farm & Charm oat | PASS | PASS |
| Farm & Charm onion | PASS | PASS |
| Farm & Charm strawberry | PASS | PASS |
| HerbalBrews coffee | PASS | PASS |
| HerbalBrews rooibos | PASS | PASS |
| HerbalBrews tea | PASS | PASS |
| HerbalBrews yerba mate | PASS | PASS |

## Lifecycle and regression results

- Representative vanilla farmland regression: PASS
- Farm & Charm fertilized farmland: PASS
- Natural growth on peat: PASS
- Natural growth on silt: PASS
- Moisture runtime: `FUNCTIONAL_PASS`
- Bonemeal: PASS
- Restart persistence: PASS
- Unrelated CropBlock behavior: `UNCHANGED`
- Tomato: `PASS_WITH_DATAPACK`
- Brewery hops datapack regression: PASS

`FUNCTIONAL_PASS` does not claim a statistically benchmarked dry-vs-hydrated
growth rate. It records that natural growth and hydrated/dry farmland behavior
worked without crashes or obvious incorrect growth behavior.
