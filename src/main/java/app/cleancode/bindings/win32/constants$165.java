// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$165 {

    static final FunctionDescriptor CreateICW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateICW$MH = RuntimeHelper.downcallHandle(
        "CreateICW",
        constants$165.CreateICW$FUNC
    );
    static final FunctionDescriptor CreateMetaFileA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateMetaFileA$MH = RuntimeHelper.downcallHandle(
        "CreateMetaFileA",
        constants$165.CreateMetaFileA$FUNC
    );
    static final FunctionDescriptor CreateMetaFileW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreateMetaFileW$MH = RuntimeHelper.downcallHandle(
        "CreateMetaFileW",
        constants$165.CreateMetaFileW$FUNC
    );
    static final FunctionDescriptor CreatePalette$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePalette$MH = RuntimeHelper.downcallHandle(
        "CreatePalette",
        constants$165.CreatePalette$FUNC
    );
    static final FunctionDescriptor CreatePen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreatePen$MH = RuntimeHelper.downcallHandle(
        "CreatePen",
        constants$165.CreatePen$FUNC
    );
    static final FunctionDescriptor CreatePenIndirect$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CreatePenIndirect$MH = RuntimeHelper.downcallHandle(
        "CreatePenIndirect",
        constants$165.CreatePenIndirect$FUNC
    );
}

