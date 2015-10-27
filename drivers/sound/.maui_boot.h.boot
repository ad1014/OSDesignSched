ifeq (,$(strip $(CONFIG_MAUI_HAVE_BOOT) $(CONFIG_MAUI_BOOT_FILE)))
FILES_BOOT_UP_TO_DATE += maui_boot.h
endif
