// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$471 {

    static final FunctionDescriptor SetUserGeoID$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetUserGeoID$MH = RuntimeHelper.downcallHandle(
        "SetUserGeoID",
        constants$471.SetUserGeoID$FUNC
    );
    static final FunctionDescriptor SetUserGeoName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetUserGeoName$MH = RuntimeHelper.downcallHandle(
        "SetUserGeoName",
        constants$471.SetUserGeoName$FUNC
    );
    static final FunctionDescriptor ConvertDefaultLocale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ConvertDefaultLocale$MH = RuntimeHelper.downcallHandle(
        "ConvertDefaultLocale",
        constants$471.ConvertDefaultLocale$FUNC
    );
    static final FunctionDescriptor GetSystemDefaultUILanguage$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT);
    static final MethodHandle GetSystemDefaultUILanguage$MH = RuntimeHelper.downcallHandle(
        "GetSystemDefaultUILanguage",
        constants$471.GetSystemDefaultUILanguage$FUNC
    );
    static final FunctionDescriptor GetThreadLocale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetThreadLocale$MH = RuntimeHelper.downcallHandle(
        "GetThreadLocale",
        constants$471.GetThreadLocale$FUNC
    );
    static final FunctionDescriptor SetThreadLocale$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadLocale$MH = RuntimeHelper.downcallHandle(
        "SetThreadLocale",
        constants$471.SetThreadLocale$FUNC
    );
}


