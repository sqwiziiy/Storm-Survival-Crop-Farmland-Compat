# Phase B — target crop registry IDs

The allowlist is explicit and contains only these ten IDs:

- `farm_and_charm:barley_crop`
- `farm_and_charm:corn_crop`
- `farm_and_charm:lettuce_crop`
- `farm_and_charm:oat_crop`
- `farm_and_charm:onion_crop`
- `farm_and_charm:strawberry_crop`
- `herbalbrews:coffee_plant`
- `herbalbrews:rooibos_plant`
- `herbalbrews:tea_plant`
- `herbalbrews:yerba_mate_plant`

The Farm & Charm IDs are corroborated by the installed-version resource
identifiers and upstream localization/registry naming. The HerbalBrews IDs
were verified from the exact public `letsdo-herbalbrews-fabric-1.0.12.jar`
(CurseForge file 6458888); its block resources and class constants use the
`_plant` IDs. The code does not link to its implementation classes.

Excluded intentionally: `farm_and_charm:tomato_crop`, Vinery grape/bush crops,
vanilla crops, and every other `CropBlock`.
