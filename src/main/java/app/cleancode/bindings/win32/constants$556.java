// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$556 {

    static final FunctionDescriptor PM_OPEN_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PM_OPEN_PROC$MH = RuntimeHelper.downcallHandle(
        constants$556.PM_OPEN_PROC$FUNC
    );
    static final FunctionDescriptor PM_COLLECT_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PM_COLLECT_PROC$MH = RuntimeHelper.downcallHandle(
        constants$556.PM_COLLECT_PROC$FUNC
    );
    static final FunctionDescriptor PM_CLOSE_PROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle PM_CLOSE_PROC$MH = RuntimeHelper.downcallHandle(
        constants$556.PM_CLOSE_PROC$FUNC
    );
}


