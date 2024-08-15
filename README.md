# meta-rpi3-docker-engine

This README file contains information on the contents of the meta-rpi3-docker-engine layer.

Please see the corresponding sections below for details.

## Dependencies

  URI: git://git.yoctoproject.org/meta-raspberrypi
  branch: dunfell

### Build and test environment

URI: https://github.com/gsp-p-77/my-IaC/tree/main/servers/03-yocto-build-env/dunfell/vagrant


## Patches

not applicable


## Table of Contents

  I. Adding the meta-rpi3-docker-engine layer to your build
  II. Misc


I. Adding the meta-rpi3-docker-engine layer to your build
=================================================

Run 'bitbake-layers add-layer meta-rpi3-docker-engine'

II. Misc
========

Bitbake the image acc to your required and supported rootfs size:

- bitbake rpi3-doe-minimal-image 
- bitbake rpi3-doe-4GB-image 
- bitbake rpi3-doe-64GB-image 

