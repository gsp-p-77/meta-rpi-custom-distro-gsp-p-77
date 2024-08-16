#!/bin/bash

echo "Clone required meta layers"

# recommended meta layer structure:
#
# poky +
#      |
# -----+---- meta-...
#      |
#
# -----+---- meta-rpi3-docker-engine
#      |
#      +---- meta-...

git clone git://git.yoctoproject.org/poky -b dunfell ../../poky/
git clone git://git.yoctoproject.org/meta-raspberrypi -b dunfell ../meta-raspberrypi
git clone git://git.openembedded.org/meta-openembedded -b dunfell ../meta-openembedded
git clone git://git.yoctoproject.org/meta-virtualization -b dunfell ../meta-virtualization/



