package ru.tdd.jblizz.diablo.clients;

import ru.tdd.jblizz.core.http.clients.BattleNetApiClient;
import ru.tdd.jblizz.core.models.Locale;
import ru.tdd.jblizz.core.models.Region;

/**
 * Клиент для получения данных Diablo 3
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public class DiabloClient extends BattleNetApiClient {

    public DiabloClient(String token, Region region, Locale locale) {
        super(token, region, locale);
    }

    /**
     * Создает экземпляр клиента для получения данных сообщества Diablo 3
     * @return клиент сообщества Diablo 3
     */
    public CommunityDiabloClient community() {
        return new CommunityDiabloClient(token, region, locale);
    }
}
