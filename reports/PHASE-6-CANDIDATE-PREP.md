# Phase 6 — Crop Farmland Compat candidate preparation

Date: 2026-09-26

## Gate status

- `DATAPACK_DELIVERY_GATE = PASS`
- `TOMATO_CODE_FIX_STATIC_GATE = PASS`
- `TOMATO_RUNTIME_GATE = PENDING`
- `REPRODUCIBLE_PACK_GATE = PENDING`

## Candidate

- Version: `0.2.0-dev+mc1.20.1`
- Artifact: `/home/mentality/Scripts/Storm-Modpack-Compat/Crop-Farmland-Compat/build/libs/storm-survival-crop-farmland-compat-0.2.0-dev+mc1.20.1.jar`
- SHA-256: `a5c340b107694ecb18b55dfb378668360a8137195899dceee8663248a16bd3f5`
- Static checks: Fabric mod id/version and Minecraft 1.20.1 metadata verified; ordinary `CropBlock` and Farm & Charm `TomatoCropBlock` mixins are present.

## Test instance

- Clean disposable instance: `/home/mentality/.var/app/org.prismlauncher.PrismLauncher/data/PrismLauncher/instances/storm-survival-0.1.0-dev+mc1.20.1`
- Old `storm-survival-crop-farmland-compat-0.1.0+mc1.20.1.jar`: removed from the test instance only and retained as a recoverable temporary backup.
- 0.2.0-dev candidate: installed in the test instance only.
- Paxi, the Farmland Compat datapack, Chat Patches, other mods, and Packwiz metadata: unchanged.

No release, tag, Modrinth upload, Packwiz update, or reproducible-pack approval was performed.
