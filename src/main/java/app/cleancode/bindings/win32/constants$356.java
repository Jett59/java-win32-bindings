// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$356 {

    static final FunctionDescriptor UpdateLayeredWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle UpdateLayeredWindow$MH = RuntimeHelper.downcallHandle(
        "UpdateLayeredWindow",
        constants$356.UpdateLayeredWindow$FUNC
    );
    static final FunctionDescriptor UpdateLayeredWindowIndirect$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UpdateLayeredWindowIndirect$MH = RuntimeHelper.downcallHandle(
        "UpdateLayeredWindowIndirect",
        constants$356.UpdateLayeredWindowIndirect$FUNC
    );
    static final FunctionDescriptor GetLayeredWindowAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLayeredWindowAttributes$MH = RuntimeHelper.downcallHandle(
        "GetLayeredWindowAttributes",
        constants$356.GetLayeredWindowAttributes$FUNC
    );
    static final FunctionDescriptor PrintWindow$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle PrintWindow$MH = RuntimeHelper.downcallHandle(
        "PrintWindow",
        constants$356.PrintWindow$FUNC
    );
    static final FunctionDescriptor SetLayeredWindowAttributes$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetLayeredWindowAttributes$MH = RuntimeHelper.downcallHandle(
        "SetLayeredWindowAttributes",
        constants$356.SetLayeredWindowAttributes$FUNC
    );
    static final FunctionDescriptor ShowWindowAsync$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ShowWindowAsync$MH = RuntimeHelper.downcallHandle(
        "ShowWindowAsync",
        constants$356.ShowWindowAsync$FUNC
    );
}


