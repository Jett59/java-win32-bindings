// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$507 {

    static final FunctionDescriptor EnumPrintersW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle EnumPrintersW$MH = RuntimeHelper.downcallHandle(
        "EnumPrintersW",
        constants$507.EnumPrintersW$FUNC
    );
    static final FunctionDescriptor GetSpoolFileHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetSpoolFileHandle$MH = RuntimeHelper.downcallHandle(
        "GetSpoolFileHandle",
        constants$507.GetSpoolFileHandle$FUNC
    );
    static final FunctionDescriptor CommitSpoolData$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CommitSpoolData$MH = RuntimeHelper.downcallHandle(
        "CommitSpoolData",
        constants$507.CommitSpoolData$FUNC
    );
    static final FunctionDescriptor CloseSpoolFileHandle$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseSpoolFileHandle$MH = RuntimeHelper.downcallHandle(
        "CloseSpoolFileHandle",
        constants$507.CloseSpoolFileHandle$FUNC
    );
    static final FunctionDescriptor OpenPrinterA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrinterA$MH = RuntimeHelper.downcallHandle(
        "OpenPrinterA",
        constants$507.OpenPrinterA$FUNC
    );
    static final FunctionDescriptor OpenPrinterW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle OpenPrinterW$MH = RuntimeHelper.downcallHandle(
        "OpenPrinterW",
        constants$507.OpenPrinterW$FUNC
    );
}


