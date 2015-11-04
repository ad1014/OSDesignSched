ifeq (,$(strip $(CONFIG_TRIX_HAVE_BOOT) $(CONFIG_TRIX_BOOT_FILE)))
FILES_BOOT_UP_TO_DATE += trix_boot.h
endif
