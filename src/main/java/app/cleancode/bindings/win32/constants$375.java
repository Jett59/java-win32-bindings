// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$375 {

    static final FunctionDescriptor GetKeyState$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyState$MH = RuntimeHelper.downcallHandle(
        "GetKeyState",
        constants$375.GetKeyState$FUNC
    );
    static final FunctionDescriptor GetAsyncKeyState$FUNC = FunctionDescriptor.of(Constants$root.C_SHORT$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetAsyncKeyState$MH = RuntimeHelper.downcallHandle(
        "GetAsyncKeyState",
        constants$375.GetAsyncKeyState$FUNC
    );
    static final FunctionDescriptor GetKeyboardState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetKeyboardState$MH = RuntimeHelper.downcallHandle(
        "GetKeyboardState",
        constants$375.GetKeyboardState$FUNC
    );
    static final FunctionDescriptor SetKeyboardState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetKeyboardState$MH = RuntimeHelper.downcallHandle(
        "SetKeyboardState",
        constants$375.SetKeyboardState$FUNC
    );
    static final FunctionDescriptor GetKeyNameTextA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyNameTextA$MH = RuntimeHelper.downcallHandle(
        "GetKeyNameTextA",
        constants$375.GetKeyNameTextA$FUNC
    );
    static final FunctionDescriptor GetKeyNameTextW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetKeyNameTextW$MH = RuntimeHelper.downcallHandle(
        "GetKeyNameTextW",
        constants$375.GetKeyNameTextW$FUNC
    );
}


