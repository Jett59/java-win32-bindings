// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$248 {

    static final FunctionDescriptor LocalSystemTimeToLocalFileTime$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LocalSystemTimeToLocalFileTime$MH = RuntimeHelper.downcallHandle(
        "LocalSystemTimeToLocalFileTime",
        constants$248.LocalSystemTimeToLocalFileTime$FUNC
    );
    static final FunctionDescriptor SetSystemPowerState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSystemPowerState$MH = RuntimeHelper.downcallHandle(
        "SetSystemPowerState",
        constants$248.SetSystemPowerState$FUNC
    );
    static final FunctionDescriptor GetSystemPowerStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSystemPowerStatus$MH = RuntimeHelper.downcallHandle(
        "GetSystemPowerStatus",
        constants$248.GetSystemPowerStatus$FUNC
    );
    static final FunctionDescriptor MapUserPhysicalPagesScatter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle MapUserPhysicalPagesScatter$MH = RuntimeHelper.downcallHandle(
        "MapUserPhysicalPagesScatter",
        constants$248.MapUserPhysicalPagesScatter$FUNC
    );
    static final FunctionDescriptor CreateJobObjectA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateJobObjectA$MH = RuntimeHelper.downcallHandle(
        "CreateJobObjectA",
        constants$248.CreateJobObjectA$FUNC
    );
    static final FunctionDescriptor OpenJobObjectA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenJobObjectA$MH = RuntimeHelper.downcallHandle(
        "OpenJobObjectA",
        constants$248.OpenJobObjectA$FUNC
    );
}


