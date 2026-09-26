## 0.2.0

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

## Initial release

Adds targeted Regions Unexplored farmland compatibility for selected Farm &
Charm and HerbalBrews crops on Minecraft 1.20.1.

### Supported RU farmland

- `regions_unexplored:peat_farmland`
- `regions_unexplored:silt_farmland`

### Farm & Charm

- barley
- corn
- lettuce
- oat
- onion
- strawberry

### HerbalBrews

- coffee
- rooibos
- tea
- yerba mate

### Validation

- Dedicated server: PASS
- RU placement matrix: 20/20 PASS
- Natural growth: PASS
- Bonemeal: PASS
- Restart persistence: PASS
- Existing vanilla/fertilized farmland behavior: PASS
- Third-party assets/binaries bundled: none

Brewery hops are handled by the separate Storm Survival Farmland Compat
datapack.
