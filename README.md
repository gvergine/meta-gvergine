# meta-gvergine
Yocto layer and configuration for my experiments on rpi4 64bit

# Ubuntu 20.04 Setup

## Required packages
```apt install build-essential chrpath diffstat gawk libncurses5-dev python3-distutils texinfo``` 

## Use bash instead of dash
```sudo dpkg-reconfigure dash```

## Clone everything
```
cd ~

git clone -b dunfell git://git.yoctoproject.org/poky.git poky-dunfell
git clone https://github.com/gvergine/rpi4-64bit

cd poky-dunfell

git clone -b dunfell git://git.openembedded.org/meta-openembedded
git clone -b dunfell https://github.com/meta-qt5/meta-qt5
git clone -b dunfell git://git.yoctoproject.org/meta-raspberrypi
git clone -b dunfell git://git.yoctoproject.org/meta-security.git

```

## Prepare build environment
```
source ~/poky-dunfell/oe-init-build-env ~/rpi4-64bit/build
```
