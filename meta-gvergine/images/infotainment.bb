include recipes-core/images/core-image-minimal.bb

ALSA += " \
    alsa-lib \
    alsa-tools \
    alsa-conf \
    alsa-state \
    alsa-utils \
    alsa-utils-scripts \
"

IMAGE_INSTALL += " \
    ${ALSA} \
"

export IMAGE_BASENAME = "infotainment"
