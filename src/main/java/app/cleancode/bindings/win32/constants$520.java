// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$520 {

    static final FunctionDescriptor DeletePrinterDataW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterDataW$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterDataW",
        constants$520.DeletePrinterDataW$FUNC
    );
    static final FunctionDescriptor DeletePrinterDataExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterDataExA$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterDataExA",
        constants$520.DeletePrinterDataExA$FUNC
    );
    static final FunctionDescriptor DeletePrinterDataExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterDataExW$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterDataExW",
        constants$520.DeletePrinterDataExW$FUNC
    );
    static final FunctionDescriptor DeletePrinterKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterKeyA$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterKeyA",
        constants$520.DeletePrinterKeyA$FUNC
    );
    static final FunctionDescriptor DeletePrinterKeyW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterKeyW$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterKeyW",
        constants$520.DeletePrinterKeyW$FUNC
    );
    static final FunctionDescriptor WaitForPrinterChange$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle WaitForPrinterChange$MH = RuntimeHelper.downcallHandle(
        "WaitForPrinterChange",
        constants$520.WaitForPrinterChange$FUNC
    );
}


