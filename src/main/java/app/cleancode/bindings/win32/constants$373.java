// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$373 {

    static final FunctionDescriptor IsNormalizedString$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsNormalizedString$MH = RuntimeHelper.downcallHandle(
        "IsNormalizedString",
        constants$373.IsNormalizedString$FUNC
    );
    static final FunctionDescriptor VerifyScripts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle VerifyScripts$MH = RuntimeHelper.downcallHandle(
        "VerifyScripts",
        constants$373.VerifyScripts$FUNC
    );
    static final FunctionDescriptor GetStringScripts$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetStringScripts$MH = RuntimeHelper.downcallHandle(
        "GetStringScripts",
        constants$373.GetStringScripts$FUNC
    );
    static final FunctionDescriptor GetLocaleInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetLocaleInfoEx$MH = RuntimeHelper.downcallHandle(
        "GetLocaleInfoEx",
        constants$373.GetLocaleInfoEx$FUNC
    );
    static final FunctionDescriptor GetCalendarInfoEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetCalendarInfoEx$MH = RuntimeHelper.downcallHandle(
        "GetCalendarInfoEx",
        constants$373.GetCalendarInfoEx$FUNC
    );
    static final FunctionDescriptor GetNumberFormatEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetNumberFormatEx$MH = RuntimeHelper.downcallHandle(
        "GetNumberFormatEx",
        constants$373.GetNumberFormatEx$FUNC
    );
}


