# Final audit

Target crop IDs:

- `farm_and_charm:barley_crop`, `corn_crop`, `lettuce_crop`, `oat_crop`, `onion_crop`, `strawberry_crop`
- `herbalbrews:coffee_plant`, `rooibos_plant`, `tea_plant`, `yerba_mate_plant`

Compatible soils: `minecraft:farmland`, `farm_and_charm:fertilized_farmland`,
`regions_unexplored:peat_farmland`, `regions_unexplored:silt_farmland`.

Mixin targets: `CropBlock#canPlantOnTop`; `CropBlock#getAvailableMoisture`.

Placement path fixed: YES

Growth/moisture path fixed: YES (functional runtime validation complete)

Farm & Charm fertilized farmland preserved: YES (not overwritten)

Tomato: `PASS_WITH_DATAPACK`

Automated validation: PASS (`CropFarmlandCompatRulesTest`; `clean build`)

Build: PASS (`./gradlew clean build`; compile, remap, test, and assemble)

Artifact: `build/libs/storm-survival-crop-farmland-compat-0.1.0+mc1.20.1.jar` (6,748 bytes)

SHA-256: `3049e51c86baa43f5049fcc4cd9b9a9d92895cea32d2e2c386a1bf827b745e3c`

Dedicated-server runtime: PASS (disposable full-modpack server reached `Done`)

Phase B runtime result: PASS — disposable server reached `Done` with the exact
relevant mods and datapack loaded; see `PHASE-D-RUNTIME-SERVER.md`.

RU placement matrix: `20/20 PASS`

Representative vanilla farmland regression: PASS

Farm & Charm fertilized farmland: PASS

Natural growth on peat: PASS

Natural growth on silt: PASS

Moisture runtime: FUNCTIONAL_PASS (functional behavior verified; no quantitative rate benchmark)

Bonemeal: PASS

Restart persistence: PASS

Unrelated CropBlock behavior: UNCHANGED

Tomato: PASS_WITH_DATAPACK

Brewery hops datapack regression: PASS

Publication gate: `PASS`

Manual Minecraft crop matrix: PASS

Third-party assets bundled: NO

Third-party binaries bundled: NO

Publication: READY

MANUAL_VALIDATION: `PASS`

PUBLICATION_GATE: `PASS`
