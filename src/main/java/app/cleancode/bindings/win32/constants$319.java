// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$319 {

    static final FunctionDescriptor GetDesktopWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle GetDesktopWindow$MH = RuntimeHelper.downcallHandle(
        "GetDesktopWindow",
        constants$319.GetDesktopWindow$FUNC
    );
    static final FunctionDescriptor GetParent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetParent$MH = RuntimeHelper.downcallHandle(
        "GetParent",
        constants$319.GetParent$FUNC
    );
    static final FunctionDescriptor SetParent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetParent$MH = RuntimeHelper.downcallHandle(
        "SetParent",
        constants$319.SetParent$FUNC
    );
    static final FunctionDescriptor EnumChildWindows$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumChildWindows$MH = RuntimeHelper.downcallHandle(
        "EnumChildWindows",
        constants$319.EnumChildWindows$FUNC
    );
    static final FunctionDescriptor FindWindowA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindWindowA$MH = RuntimeHelper.downcallHandle(
        "FindWindowA",
        constants$319.FindWindowA$FUNC
    );
    static final FunctionDescriptor FindWindowW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle FindWindowW$MH = RuntimeHelper.downcallHandle(
        "FindWindowW",
        constants$319.FindWindowW$FUNC
    );
}

