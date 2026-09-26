# Modrinth release metadata

## Project

- Name: Storm Survival Crop Farmland Compat
- Slug: `storm-survival-crop-farmland-compat`
- Summary: Adds Regions Unexplored peat and silt farmland support for selected Farm & Charm and HerbalBrews crops on Minecraft 1.20.1.
- Type: Mod
- License: MIT
- Minecraft: 1.20.1
- Loader: Fabric
- Client: Optional
- Server: Required
- Categories: Utility, Game Mechanics
- Source: https://github.com/sqwiziiy/storm-survival-crop-farmland-compat
- Issues: https://github.com/sqwiziiy/storm-survival-crop-farmland-compat/issues
- Derivative work: OFF
- AI disclosure: Code ON, Text ON, Resources OFF

No icon, banner, or gallery image is required.

## Relationships

- Regions Unexplored (`Tkikq67H`): REQUIRED; tested version `rhE8MT9Z` (`A-0.5.6+1.20.1`).
- [Let's Do] Farm & Charm (`HJetCzWo`): OPTIONAL; tested version `sMjnKy5B` (`1.0.14`).
- [Let's Do] HerbalBrews (`Eh11TaTm`): OPTIONAL; tested Fabric version `txZ8qKXK` (`1.0.12`).
- Fabric API: `NOT DIRECT`; `fabric.mod.json` does not declare Fabric API. It was present in the tested environment through the modpack's other dependencies.
- Storm Survival Farmland Compat datapack: recommended companion, not a Java dependency.

Farm & Charm and HerbalBrews are optional independently because the compat mod
uses a narrow registry-ID allowlist and does not require both crop mods.

## Version

- Version number: `0.1.0`
- Version name: Storm Survival Crop Farmland Compat 0.1.0 — Minecraft 1.20.1
- Release type: Release
- Minecraft: 1.20.1
- Loader: Fabric
- File: `storm-survival-crop-farmland-compat-0.1.0+mc1.20.1.jar`

## Project description

Use the public README content for the project description. The project is a
small Fabric compatibility mod for Minecraft 1.20.1 that supports selected
Farm & Charm and HerbalBrews crops on Regions Unexplored peat and silt
farmland, without globally changing other crops or adding a growth bonus.

## Release description

Initial release. Adds targeted RU peat/silt farmland compatibility for the six
Farm & Charm crops and four HerbalBrews crops. Validation: dedicated server
PASS, 20/20 RU placements PASS, natural growth PASS, bonemeal PASS, restart
persistence PASS, existing farmland behavior PASS, and no third-party assets
or binaries bundled. Brewery hops remain handled by the companion datapack.
