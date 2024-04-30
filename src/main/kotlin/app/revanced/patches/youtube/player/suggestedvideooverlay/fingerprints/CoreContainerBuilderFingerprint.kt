package app.revanced.patches.youtube.player.suggestedvideooverlay.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patches.youtube.utils.resourceid.SharedResourceIdPatch.SizeAdjustableLiteAutoNavOverlay
import app.revanced.util.fingerprint.LiteralValueFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

internal object CoreContainerBuilderFingerprint : LiteralValueFingerprint(
    returnType= "Landroid/view/View;",
    accessFlags = AccessFlags.PUBLIC or AccessFlags.FINAL,
    parameters = listOf("Landroid/content/Context;"),
    opcodes = listOf(
        Opcode.INVOKE_DIRECT,
        Opcode.INVOKE_VIRTUAL,
        Opcode.CONST
    ),
    literalSupplier = { SizeAdjustableLiteAutoNavOverlay }
)