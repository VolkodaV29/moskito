package ru.volkodav.i18n;

import ru.volkodav.entity.Country;

public interface LocalizationService {

    String locale(Country country);
}
