# meta-rpi-custom-distro-gsp-p-77

This repository provides a custom Yocto distro for my private Raspberry PI use cases such as bitbaking images:
- to realize docker engines (status: Finished)
- to realize Kodi instances (status: Planned next)
- ...

## Dependencies

Refer to https://github.com/gsp-p-77/meta-rpi-custom-distro-gsp-p-77/blob/main/clone_layers.sh

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
- Adapt /recipes-support/nmcli-wifi-connect/files/nmcli-wifi-connect.service (SSID and PSK)
  
II. Misc
========

Bitbake the image acc to your required and supported rootfs size:

- bitbake rpi3-doe-minimal-image 
- bitbake rpi3-doe-4GB-image 
- bitbake rpi3-doe-64GB-image 

