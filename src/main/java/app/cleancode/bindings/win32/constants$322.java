// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$322 {

    static final FunctionDescriptor GetLastActivePopup$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetLastActivePopup$MH = RuntimeHelper.downcallHandle(
        "GetLastActivePopup",
        constants$322.GetLastActivePopup$FUNC
    );
    static final FunctionDescriptor GetWindow$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetWindow$MH = RuntimeHelper.downcallHandle(
        "GetWindow",
        constants$322.GetWindow$FUNC
    );
    static final FunctionDescriptor SetWindowsHookA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWindowsHookA$MH = RuntimeHelper.downcallHandle(
        "SetWindowsHookA",
        constants$322.SetWindowsHookA$FUNC
    );
    static final FunctionDescriptor SetWindowsHookW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetWindowsHookW$MH = RuntimeHelper.downcallHandle(
        "SetWindowsHookW",
        constants$322.SetWindowsHookW$FUNC
    );
    static final FunctionDescriptor UnhookWindowsHook$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnhookWindowsHook$MH = RuntimeHelper.downcallHandle(
        "UnhookWindowsHook",
        constants$322.UnhookWindowsHook$FUNC
    );
    static final FunctionDescriptor SetWindowsHookExA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWindowsHookExA$MH = RuntimeHelper.downcallHandle(
        "SetWindowsHookExA",
        constants$322.SetWindowsHookExA$FUNC
    );
}


