// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$306 {

    static final FunctionDescriptor GetMenuContextHelpId$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetMenuContextHelpId$MH = RuntimeHelper.downcallHandle(
        "GetMenuContextHelpId",
        constants$306.GetMenuContextHelpId$FUNC
    );
    static final FunctionDescriptor MessageBoxA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MessageBoxA$MH = RuntimeHelper.downcallHandle(
        "MessageBoxA",
        constants$306.MessageBoxA$FUNC
    );
    static final FunctionDescriptor MessageBoxW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle MessageBoxW$MH = RuntimeHelper.downcallHandle(
        "MessageBoxW",
        constants$306.MessageBoxW$FUNC
    );
    static final FunctionDescriptor MessageBoxExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle MessageBoxExA$MH = RuntimeHelper.downcallHandle(
        "MessageBoxExA",
        constants$306.MessageBoxExA$FUNC
    );
    static final FunctionDescriptor MessageBoxExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_SHORT$LAYOUT
    );
    static final MethodHandle MessageBoxExW$MH = RuntimeHelper.downcallHandle(
        "MessageBoxExW",
        constants$306.MessageBoxExW$FUNC
    );
    static final FunctionDescriptor MSGBOXCALLBACK$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
}

