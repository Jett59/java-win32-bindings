// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$673 {

    static final FunctionDescriptor SetPrinterDataExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPrinterDataExW$MH = RuntimeHelper.downcallHandle(
        "SetPrinterDataExW",
        constants$673.SetPrinterDataExW$FUNC
    );
    static final FunctionDescriptor DeletePrinterDataA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterDataA$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterDataA",
        constants$673.DeletePrinterDataA$FUNC
    );
    static final FunctionDescriptor DeletePrinterDataW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterDataW$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterDataW",
        constants$673.DeletePrinterDataW$FUNC
    );
    static final FunctionDescriptor DeletePrinterDataExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterDataExA$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterDataExA",
        constants$673.DeletePrinterDataExA$FUNC
    );
    static final FunctionDescriptor DeletePrinterDataExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterDataExW$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterDataExW",
        constants$673.DeletePrinterDataExW$FUNC
    );
    static final FunctionDescriptor DeletePrinterKeyA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeletePrinterKeyA$MH = RuntimeHelper.downcallHandle(
        "DeletePrinterKeyA",
        constants$673.DeletePrinterKeyA$FUNC
    );
}


