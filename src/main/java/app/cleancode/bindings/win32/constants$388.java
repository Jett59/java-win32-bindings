// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$388 {

    static final FunctionDescriptor CreateAcceleratorTableW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CreateAcceleratorTableW$MH = RuntimeHelper.downcallHandle(
        "CreateAcceleratorTableW",
        constants$388.CreateAcceleratorTableW$FUNC
    );
    static final FunctionDescriptor DestroyAcceleratorTable$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DestroyAcceleratorTable$MH = RuntimeHelper.downcallHandle(
        "DestroyAcceleratorTable",
        constants$388.DestroyAcceleratorTable$FUNC
    );
    static final FunctionDescriptor CopyAcceleratorTableA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CopyAcceleratorTableA$MH = RuntimeHelper.downcallHandle(
        "CopyAcceleratorTableA",
        constants$388.CopyAcceleratorTableA$FUNC
    );
    static final FunctionDescriptor CopyAcceleratorTableW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle CopyAcceleratorTableW$MH = RuntimeHelper.downcallHandle(
        "CopyAcceleratorTableW",
        constants$388.CopyAcceleratorTableW$FUNC
    );
    static final FunctionDescriptor TranslateAcceleratorA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TranslateAcceleratorA$MH = RuntimeHelper.downcallHandle(
        "TranslateAcceleratorA",
        constants$388.TranslateAcceleratorA$FUNC
    );
    static final FunctionDescriptor TranslateAcceleratorW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle TranslateAcceleratorW$MH = RuntimeHelper.downcallHandle(
        "TranslateAcceleratorW",
        constants$388.TranslateAcceleratorW$FUNC
    );
}


