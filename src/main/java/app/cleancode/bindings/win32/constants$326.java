// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$326 {

    static final FunctionDescriptor DestroyIcon$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyIcon$MH = RuntimeHelper.downcallHandle(
        "DestroyIcon",
        constants$326.DestroyIcon$FUNC
    );
    static final FunctionDescriptor LookupIconIdFromDirectory$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LookupIconIdFromDirectory$MH = RuntimeHelper.downcallHandle(
        "LookupIconIdFromDirectory",
        constants$326.LookupIconIdFromDirectory$FUNC
    );
    static final FunctionDescriptor LookupIconIdFromDirectoryEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LookupIconIdFromDirectoryEx$MH = RuntimeHelper.downcallHandle(
        "LookupIconIdFromDirectoryEx",
        constants$326.LookupIconIdFromDirectoryEx$FUNC
    );
    static final FunctionDescriptor CreateIconFromResource$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateIconFromResource$MH = RuntimeHelper.downcallHandle(
        "CreateIconFromResource",
        constants$326.CreateIconFromResource$FUNC
    );
    static final FunctionDescriptor CreateIconFromResourceEx$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateIconFromResourceEx$MH = RuntimeHelper.downcallHandle(
        "CreateIconFromResourceEx",
        constants$326.CreateIconFromResourceEx$FUNC
    );
    static final FunctionDescriptor LoadImageA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle LoadImageA$MH = RuntimeHelper.downcallHandle(
        "LoadImageA",
        constants$326.LoadImageA$FUNC
    );
}


