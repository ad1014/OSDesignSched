ifeq (,$(strip $(CONFIG_PSS_HAVE_BOOT) $(CONFIG_PSS_BOOT_FILE)))
FILES_BOOT_UP_TO_DATE += pss_boot.h
endif
