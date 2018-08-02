PHONIES += dist
.PHONY: $(PHONIES)

GPG2      = gpg

VERSION   = 0.9.0-alpha.4
OVERSION  = $(VERSION)-1
OUTPUT    = android-libs-$(OVERSION).aar
POM       = android-libs-$(OVERSION).pom

dist:
	./script/m4
	./script/swig
	./script/android/download
	./script/swig-nettest  # must be after ./script/android/download
	./script/android/build
	./script/android/archive $(OUTPUT) $(POM) $(OVERSION)
