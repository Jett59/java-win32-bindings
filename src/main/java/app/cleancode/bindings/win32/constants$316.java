// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$316 {

    static final FunctionDescriptor SetWindowLongA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWindowLongA$MH = RuntimeHelper.downcallHandle(
        "SetWindowLongA",
        constants$316.SetWindowLongA$FUNC
    );
    static final FunctionDescriptor SetWindowLongW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWindowLongW$MH = RuntimeHelper.downcallHandle(
        "SetWindowLongW",
        constants$316.SetWindowLongW$FUNC
    );
    static final FunctionDescriptor GetWindowLongPtrA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetWindowLongPtrA$MH = RuntimeHelper.downcallHandle(
        "GetWindowLongPtrA",
        constants$316.GetWindowLongPtrA$FUNC
    );
    static final FunctionDescriptor GetWindowLongPtrW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetWindowLongPtrW$MH = RuntimeHelper.downcallHandle(
        "GetWindowLongPtrW",
        constants$316.GetWindowLongPtrW$FUNC
    );
    static final FunctionDescriptor SetWindowLongPtrA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetWindowLongPtrA$MH = RuntimeHelper.downcallHandle(
        "SetWindowLongPtrA",
        constants$316.SetWindowLongPtrA$FUNC
    );
    static final FunctionDescriptor SetWindowLongPtrW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SetWindowLongPtrW$MH = RuntimeHelper.downcallHandle(
        "SetWindowLongPtrW",
        constants$316.SetWindowLongPtrW$FUNC
    );
}


