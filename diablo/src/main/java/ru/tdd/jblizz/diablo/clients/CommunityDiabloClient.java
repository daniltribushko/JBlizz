package ru.tdd.jblizz.diablo.clients;

import com.google.gson.reflect.TypeToken;
import okhttp3.Request;
import ru.tdd.jblizz.core.models.Locale;
import ru.tdd.jblizz.core.models.Region;
import ru.tdd.jblizz.core.utils.HttpUtils;
import ru.tdd.jblizz.core.utils.Url;
import ru.tdd.jblizz.diablo.http.DiabloPartPaths;
import ru.tdd.jblizz.diablo.models.community.acts.Act;
import ru.tdd.jblizz.diablo.models.community.acts.Acts;
import ru.tdd.jblizz.diablo.models.community.artisans.Artisan;
import ru.tdd.jblizz.diablo.models.community.artisans.ArtisanSlug;
import ru.tdd.jblizz.diablo.models.community.artisans.TrainedRecipe;
import ru.tdd.jblizz.diablo.models.community.characters.CharacterClass;
import ru.tdd.jblizz.diablo.models.community.characters.CharacterClassSlug;
import ru.tdd.jblizz.diablo.models.community.followers.Follower;
import ru.tdd.jblizz.diablo.models.community.followers.FollowerSlug;
import ru.tdd.jblizz.diablo.models.community.items.Item;
import ru.tdd.jblizz.diablo.models.community.items.ItemTypeIndex;
import ru.tdd.jblizz.diablo.models.community.items.ItemTypeSlug;
import ru.tdd.jblizz.diablo.models.community.skills.SkillWithRunes;

import java.util.List;

/**
 * Клиент для получения данных сообщества Diablo 3
 *
 * @author Tribushko Danil
 * @see <a href=https://develop.battle.net/documentation/diablo-3/community-apis>Diablo III Community APIs</a>
 * @since 19.07.2025
 * <p>
 * Пример использования:
 * <pre>{@code
 *     new DiabloClient("example_token", Region.EU, Locale.RU)
 *         .community()
 *         .getActIndex()
 * }</pre>
 */
public final class CommunityDiabloClient extends DiabloClient {
    public CommunityDiabloClient(String token, Region region, Locale locale) {
        super(token, region, locale);
        this.url += "/d3/data";
    }

    /**
     * Получает все игровые акты
     * @return объект со списком игровых актов
     */
    public Acts getActIndex() {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.ACT)
                                .addQueryParam("locale", locale.getCode())
                                .build()
                )
                .build();
        return HttpUtils.getResponse(request, Acts.class);
    }

    /**
     * Получает игровой акт по указанному идентификатору акта
     * @param id идентификатор акта
     * @return объект игрового акта
     */
    public Act getAct(Integer id) {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.ACT)
                                .addPathParam(id)
                                .addQueryParam("locale", locale.getCode())
                                .build()
                )
                .build();

        return HttpUtils.getResponse(request, Act.class);
    }

    /**
     * Получает nps-ремесленника по указанному идентификатору ремесленника
     * @param artisanSlug идентификатор ремесленника
     * @see ArtisanSlug
     * @return объект nps-ремесленника
     */
    public Artisan getArtisan(ArtisanSlug artisanSlug) {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.ARTISAN)
                                .addPathParam(artisanSlug.getSlug())
                                .addQueryParam("locale", locale.getCode())
                                .build()
                )
                .build();

        return HttpUtils.getResponse(request, Artisan.class);
    }

    /**
     * Получает рецепт по идентификаторам ремесленника и рецепта
     * @param artisanSlug идентификатор ремесленника
     * @see ArtisanSlug
     * @param recipeSlug идентификатор рецепта
     * @return объект рецепта ремесленника
     */
    public TrainedRecipe getRecipe(ArtisanSlug artisanSlug, String recipeSlug) {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.ARTISAN)
                                .addPathParam(artisanSlug.getSlug())
                                .addPathParam(DiabloPartPaths.Community.RECIPE)
                                .addPathParam(recipeSlug)
                                .addQueryParam("locale", locale.getCode())
                                .build()
                )
                .build();

        return HttpUtils.getResponse(request, TrainedRecipe.class);
    }

    /**
     * Получает идентификатор игрового спутника персонажа по идентификатору
     * @param followerSlug идентификатор игрового спутника персонажа
     * @see FollowerSlug
     * @return игровой спутник персонажа
     */
    public Follower getFollower(FollowerSlug followerSlug) {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.FOLLOWER)
                                .addPathParam(followerSlug.getSlug())
                                .addQueryParam("locale", locale.getCode())
                                .build()
                ).build();

        return HttpUtils.getResponse(request, Follower.class);
    }

    /**
     * Полуает игровой класс по идентификатоу
     * @param characterClassSlug идентификатор игрового класса
     * @see CharacterClassSlug
     * @return объект игрового класса
     */
    public CharacterClass getCharacterClass(CharacterClassSlug characterClassSlug) {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.CHARACTER_CLASS)
                                .addPathParam(characterClassSlug.getSlug())
                                .addQueryParam("locale", locale.getCode())
                                .build()
                ).build();

        return HttpUtils.getResponse(request, CharacterClass.class);
    }

    /**
     * Получает навык класса с доступными рунами по идентификаторам класса и навыка
     * @param characterClassSlug идентификатор класса
     * @param skillSlug идентификатор навыка
     * @return объект навыка с рунами
     */
    public SkillWithRunes getSkill(CharacterClassSlug characterClassSlug, String skillSlug) {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.CHARACTER_CLASS)
                                .addPathParam(characterClassSlug.getSlug())
                                .addPathParam(DiabloPartPaths.Community.SKILL)
                                .addPathParam(skillSlug)
                                .addQueryParam("locale", locale.getCode())
                                .build()
                )
                .build();

        return HttpUtils.getResponse(request, SkillWithRunes.class);
    }

    /**
     * Получает идентификаторы типов игровых премдетов
     * @return список объектов идентификаторов игровых предметов
     */
    public List<ItemTypeIndex> getItemTypeIndex() {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.ITEM_TYPE)
                                .build()
                )
                .build();

        return HttpUtils.getResponse(request, new TypeToken<List<ItemTypeIndex>>() {
        }.getType());
    }

    /**
     * Получает список названий игровых предметов по идентификатору типа предмета
     * @param itemTypeSlug идентификатор типа предмета
     * @return список объектов названий игровых предметов
     */
    public List<ItemTypeSlug> getItemType(String itemTypeSlug) {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.ITEM_TYPE)
                                .addPathParam(itemTypeSlug)
                                .build()
                )
                .build();

        return HttpUtils.getResponse(request, new TypeToken<List<ItemTypeSlug>>() {
        }.getType());
    }

    /**
     * Получает игровой предмет по названию и идентификатору
     * @param itemSlug название предмета
     * @param itemId идентификатором предмета
     * @return объект игрового предмета
     */
    public Item getItem(String itemSlug, String itemId) {
        Request request = new Request.Builder()
                .header("Authorization", HttpUtils.BEARER_AUTH_HEADER + " " + token)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .url(
                        Url.builder(url)
                                .addPathParam(DiabloPartPaths.Community.ITEM)
                                .addPathParam(itemSlug + "-" + itemId)
                                .build()
                )
                .build();

        return HttpUtils.getResponse(request, Item.class);
    }
}
