// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$472 {

    static final FunctionDescriptor GetUserDefaultUILanguage$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetUserDefaultUILanguage$MH = RuntimeHelper.downcallHandle(
        "GetUserDefaultUILanguage",
        constants$472.GetUserDefaultUILanguage$FUNC
    );
    static final FunctionDescriptor GetUserDefaultLangID$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetUserDefaultLangID$MH = RuntimeHelper.downcallHandle(
        "GetUserDefaultLangID",
        constants$472.GetUserDefaultLangID$FUNC
    );
    static final FunctionDescriptor GetSystemDefaultLangID$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetSystemDefaultLangID$MH = RuntimeHelper.downcallHandle(
        "GetSystemDefaultLangID",
        constants$472.GetSystemDefaultLangID$FUNC
    );
    static final FunctionDescriptor GetSystemDefaultLCID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetSystemDefaultLCID$MH = RuntimeHelper.downcallHandle(
        "GetSystemDefaultLCID",
        constants$472.GetSystemDefaultLCID$FUNC
    );
    static final FunctionDescriptor GetUserDefaultLCID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetUserDefaultLCID$MH = RuntimeHelper.downcallHandle(
        "GetUserDefaultLCID",
        constants$472.GetUserDefaultLCID$FUNC
    );
    static final FunctionDescriptor SetThreadUILanguage$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle SetThreadUILanguage$MH = RuntimeHelper.downcallHandle(
        "SetThreadUILanguage",
        constants$472.SetThreadUILanguage$FUNC
    );
}


