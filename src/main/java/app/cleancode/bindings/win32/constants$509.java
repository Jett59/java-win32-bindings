// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$509 {

    static final FunctionDescriptor EnumJobsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumJobsA$MH = RuntimeHelper.downcallHandle(
        "EnumJobsA",
        constants$509.EnumJobsA$FUNC
    );
    static final FunctionDescriptor EnumJobsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumJobsW$MH = RuntimeHelper.downcallHandle(
        "EnumJobsW",
        constants$509.EnumJobsW$FUNC
    );
    static final FunctionDescriptor AddPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddPrinterA$MH = RuntimeHelper.downcallHandle(
        "AddPrinterA",
        constants$509.AddPrinterA$FUNC
    );
    static final FunctionDescriptor AddPrinterW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle AddPrinterW$MH = RuntimeHelper.downcallHandle(
        "AddPrinterW",
        constants$509.AddPrinterW$FUNC
    );
    static final FunctionDescriptor DeletePrinter$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinter$MH = RuntimeHelper.downcallHandle(
        "DeletePrinter",
        constants$509.DeletePrinter$FUNC
    );
    static final FunctionDescriptor SetPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPrinterA$MH = RuntimeHelper.downcallHandle(
        "SetPrinterA",
        constants$509.SetPrinterA$FUNC
    );
}

