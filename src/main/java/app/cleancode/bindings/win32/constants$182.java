// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$182 {

    static final FunctionDescriptor GetTextExtentExPointW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTextExtentExPointW$MH = RuntimeHelper.downcallHandle(
        "GetTextExtentExPointW",
        constants$182.GetTextExtentExPointW$FUNC
    );
    static final FunctionDescriptor GetTextCharset$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetTextCharset$MH = RuntimeHelper.downcallHandle(
        "GetTextCharset",
        constants$182.GetTextCharset$FUNC
    );
    static final FunctionDescriptor GetTextCharsetInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetTextCharsetInfo$MH = RuntimeHelper.downcallHandle(
        "GetTextCharsetInfo",
        constants$182.GetTextCharsetInfo$FUNC
    );
    static final FunctionDescriptor TranslateCharsetInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle TranslateCharsetInfo$MH = RuntimeHelper.downcallHandle(
        "TranslateCharsetInfo",
        constants$182.TranslateCharsetInfo$FUNC
    );
    static final FunctionDescriptor GetFontLanguageInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetFontLanguageInfo$MH = RuntimeHelper.downcallHandle(
        "GetFontLanguageInfo",
        constants$182.GetFontLanguageInfo$FUNC
    );
    static final FunctionDescriptor GetCharacterPlacementA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetCharacterPlacementA$MH = RuntimeHelper.downcallHandle(
        "GetCharacterPlacementA",
        constants$182.GetCharacterPlacementA$FUNC
    );
}

