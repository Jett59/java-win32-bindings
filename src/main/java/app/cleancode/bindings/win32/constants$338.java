// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$338 {

    static final FunctionDescriptor WINEVENTPROC$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WINEVENTPROC$MH = RuntimeHelper.downcallHandle(
        constants$338.WINEVENTPROC$FUNC
    );
    static final FunctionDescriptor SetWinEventHook$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetWinEventHook$MH = RuntimeHelper.downcallHandle(
        "SetWinEventHook",
        constants$338.SetWinEventHook$FUNC
    );
    static final FunctionDescriptor IsWinEventHookInstalled$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle IsWinEventHookInstalled$MH = RuntimeHelper.downcallHandle(
        "IsWinEventHookInstalled",
        constants$338.IsWinEventHookInstalled$FUNC
    );
    static final FunctionDescriptor UnhookWinEvent$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnhookWinEvent$MH = RuntimeHelper.downcallHandle(
        "UnhookWinEvent",
        constants$338.UnhookWinEvent$FUNC
    );
    static final FunctionDescriptor GetGUIThreadInfo$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetGUIThreadInfo$MH = RuntimeHelper.downcallHandle(
        "GetGUIThreadInfo",
        constants$338.GetGUIThreadInfo$FUNC
    );
}


