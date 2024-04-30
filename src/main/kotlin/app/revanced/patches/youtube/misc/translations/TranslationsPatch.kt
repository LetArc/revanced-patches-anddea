package app.revanced.patches.youtube.misc.translations

import app.revanced.patcher.data.ResourceContext
import app.revanced.patcher.patch.annotation.CompatiblePackage
import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.shared.patch.translations.AbstractTranslationsPatch
import app.revanced.patches.youtube.utils.settings.SettingsPatch

@Patch(
    name = "Translations",
    description = "Add Crowdin translations for YouTube.",
    dependencies = [SettingsPatch::class],
    compatiblePackages = [
        CompatiblePackage(
            "com.google.android.youtube",
            [
                "18.25.40",
                "18.27.36",
                "18.29.38",
                "18.30.37",
                "18.31.40",
                "18.32.39",
                "18.33.40",
                "18.34.38",
                "18.35.36",
                "18.36.39",
                "18.37.36",
                "18.38.44",
                "18.39.41",
                "18.40.34",
                "18.41.39",
                "18.42.41",
                "18.43.45",
                "18.44.41",
                "18.45.43",
                "18.46.45",
                "18.48.39",
                "18.49.37",
                "19.01.34",
                "19.02.39",
                "19.03.36",
                "19.04.38",
                "19.05.36",
                "19.06.39",
                "19.07.40",
                "19.08.36",
                "19.09.38",
                "19.10.39",
                "19.11.43",
                "19.12.41",
                "19.13.37",
                "19.14.43",
                "19.15.36",
                "19.16.38"
            ]
        )
    ]
)
@Suppress("unused")
object TranslationsPatch : AbstractTranslationsPatch(
    "youtube",
    arrayOf(
        "ar",
        "bg-rBG",
        "bn",
        "de-rDE",
        "el-rGR",
        "es-rES",
        "fi-rFI",
        "fr-rFR",
        "hu-rHU",
        "id-rID",
        "in",
        "it-rIT",
        "ja-rJP",
        "ko-rKR",
        "pl-rPL",
        "pt-rBR",
        "ru-rRU",
        "tr-rTR",
        "uk-rUA",
        "vi-rVN",
        "zh-rCN",
        "zh-rTW"
    )
) {
    override fun execute(context: ResourceContext) {
        super.execute(context)

        SettingsPatch.updatePatchStatus("Translations")
    }
}