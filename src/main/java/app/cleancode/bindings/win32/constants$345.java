// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$345 {

    static final FunctionDescriptor RegisterHotKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RegisterHotKey$MH = RuntimeHelper.downcallHandle(
        "RegisterHotKey",
        constants$345.RegisterHotKey$FUNC
    );
    static final FunctionDescriptor UnregisterHotKey$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UnregisterHotKey$MH = RuntimeHelper.downcallHandle(
        "UnregisterHotKey",
        constants$345.UnregisterHotKey$FUNC
    );
    static final FunctionDescriptor ExitWindowsEx$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ExitWindowsEx$MH = RuntimeHelper.downcallHandle(
        "ExitWindowsEx",
        constants$345.ExitWindowsEx$FUNC
    );
    static final FunctionDescriptor SwapMouseButton$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SwapMouseButton$MH = RuntimeHelper.downcallHandle(
        "SwapMouseButton",
        constants$345.SwapMouseButton$FUNC
    );
    static final FunctionDescriptor GetMessagePos$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessagePos$MH = RuntimeHelper.downcallHandle(
        "GetMessagePos",
        constants$345.GetMessagePos$FUNC
    );
    static final FunctionDescriptor GetMessageTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle GetMessageTime$MH = RuntimeHelper.downcallHandle(
        "GetMessageTime",
        constants$345.GetMessageTime$FUNC
    );
}


