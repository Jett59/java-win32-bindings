// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$516 {

    static final FunctionDescriptor AddJobA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddJobA$MH = RuntimeHelper.downcallHandle(
        "AddJobA",
        constants$516.AddJobA$FUNC
    );
    static final FunctionDescriptor AddJobW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddJobW$MH = RuntimeHelper.downcallHandle(
        "AddJobW",
        constants$516.AddJobW$FUNC
    );
    static final FunctionDescriptor ScheduleJob$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle ScheduleJob$MH = RuntimeHelper.downcallHandle(
        "ScheduleJob",
        constants$516.ScheduleJob$FUNC
    );
    static final FunctionDescriptor PrinterProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PrinterProperties$MH = RuntimeHelper.downcallHandle(
        "PrinterProperties",
        constants$516.PrinterProperties$FUNC
    );
    static final FunctionDescriptor DocumentPropertiesA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DocumentPropertiesA$MH = RuntimeHelper.downcallHandle(
        "DocumentPropertiesA",
        constants$516.DocumentPropertiesA$FUNC
    );
    static final FunctionDescriptor DocumentPropertiesW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DocumentPropertiesW$MH = RuntimeHelper.downcallHandle(
        "DocumentPropertiesW",
        constants$516.DocumentPropertiesW$FUNC
    );
}


