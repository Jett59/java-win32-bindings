// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$99 {

    static final FunctionDescriptor lstrlenA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lstrlenA$MH = RuntimeHelper.downcallHandle(
        "lstrlenA",
        constants$99.lstrlenA$FUNC
    );
    static final FunctionDescriptor lstrlenW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lstrlenW$MH = RuntimeHelper.downcallHandle(
        "lstrlenW",
        constants$99.lstrlenW$FUNC
    );
    static final FunctionDescriptor OpenFile$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenFile$MH = RuntimeHelper.downcallHandle(
        "OpenFile",
        constants$99.OpenFile$FUNC
    );
    static final FunctionDescriptor _lopen$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lopen$MH = RuntimeHelper.downcallHandle(
        "_lopen",
        constants$99._lopen$FUNC
    );
    static final FunctionDescriptor _lcreat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lcreat$MH = RuntimeHelper.downcallHandle(
        "_lcreat",
        constants$99._lcreat$FUNC
    );
    static final FunctionDescriptor _lread$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle _lread$MH = RuntimeHelper.downcallHandle(
        "_lread",
        constants$99._lread$FUNC
    );
}

