# meta-rpi3-docker-engine

This README file contains information on the contents of the meta-rpi3-docker-engine layer.

Please see the corresponding sections below for details.

## Dependencies

Refer to https://github.com/gsp-p-77/meta-rpi3-docker-engine/blob/main/clone_layers.sh

### Build and test environment

URI: https://github.com/gsp-p-77/my-IaC/tree/main/servers/03-yocto-build-env/dunfell/vagrant


## Patches

not applicable


## Table of Contents

  I. Adding the meta-rpi3-docker-engine layer to your build
  II. Misc


I. Adding the meta-rpi3-docker-engine layer to your build
=================================================

- initialize poky:
  - cd poky
  - source source oe-init-build-env
- Copy meta-rpi3-docker-engine/local_conf to build/conf
- Adapt build/conf/local_conf to your needs (especially the root pw!)

II. Misc
========

Bitbake the image acc to your required and supported rootfs size:

- bitbake rpi3-doe-minimal-image 
- bitbake rpi3-doe-4GB-image 
- bitbake rpi3-doe-64GB-image 

