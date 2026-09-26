# Phase D — dedicated-server runtime validation

## Profile

Validation used a disposable copy at `/tmp/storm-crop-runtime`, based on the
local Storm Survival Fabric 1.20.1 server profile. It contained the exact
Regions Unexplored 0.5.6+1.20.1, Farm & Charm 1.0.14, HerbalBrews 1.0.12,
Fabric API 0.92.12, and the released Farmland Compat datapack, plus the Phase
B artifact. The temporary server used port 25575 and was not the production
server directory.

## Result

`DEDICATED_SERVER_RUNTIME = PASS`

The server reached `Done (49.565s)` and loaded the full relevant mod set. The
compat mod logged `Loaded targeted CropBlock farmland compatibility`. The
datapack was discovered and loaded automatically:

```text
Found new data pack file/storm-survival-farmland-compat-0.1.0+1.20.1.zip, loading it automatically
Starting Minecraft server version 1.20.1
Starting Minecraft server on *:25575
Done (49.565s)! For help, type "help"
```

No `InvalidMixinException`, `InjectionError`, `MixinApplyError`, or compat
classloading failure occurred. The log confirms the relevant mods:

```text
- farm_and_charm 1.0.14
- herbalbrews 1.0.12
- regions_unexplored 0.5.6+1.20.1
- storm_survival_crop_farmland_compat 0.1.0+1.20.1
```

The sandbox-only launch attempt failed to bind a socket, so it was repeated
with local network permission. The successful run had one unrelated temporary
RCON warning because the copied server configuration reused port 25575; the
Minecraft server itself started successfully. Other warnings/errors were
pre-existing modpack issues such as missing data fixers and unrelated missing
optional entity types; none referenced this compat mod or its mixin.

The server was stopped after validation. No production server files were
modified.
