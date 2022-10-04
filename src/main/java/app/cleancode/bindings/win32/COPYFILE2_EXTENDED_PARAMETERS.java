// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class COPYFILE2_EXTENDED_PARAMETERS {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("dwSize"),
        Constants$root.C_LONG$LAYOUT.withName("dwCopyFlags"),
        Constants$root.C_POINTER$LAYOUT.withName("pfCancel"),
        Constants$root.C_POINTER$LAYOUT.withName("pProgressRoutine"),
        Constants$root.C_POINTER$LAYOUT.withName("pvCallbackContext")
    ).withName("COPYFILE2_EXTENDED_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return COPYFILE2_EXTENDED_PARAMETERS.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return COPYFILE2_EXTENDED_PARAMETERS.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)COPYFILE2_EXTENDED_PARAMETERS.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        COPYFILE2_EXTENDED_PARAMETERS.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)COPYFILE2_EXTENDED_PARAMETERS.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        COPYFILE2_EXTENDED_PARAMETERS.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCopyFlags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("dwCopyFlags"));
    public static VarHandle dwCopyFlags$VH() {
        return COPYFILE2_EXTENDED_PARAMETERS.dwCopyFlags$VH;
    }
    public static int dwCopyFlags$get(MemorySegment seg) {
        return (int)COPYFILE2_EXTENDED_PARAMETERS.dwCopyFlags$VH.get(seg);
    }
    public static void dwCopyFlags$set( MemorySegment seg, int x) {
        COPYFILE2_EXTENDED_PARAMETERS.dwCopyFlags$VH.set(seg, x);
    }
    public static int dwCopyFlags$get(MemorySegment seg, long index) {
        return (int)COPYFILE2_EXTENDED_PARAMETERS.dwCopyFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCopyFlags$set(MemorySegment seg, long index, int x) {
        COPYFILE2_EXTENDED_PARAMETERS.dwCopyFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfCancel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pfCancel"));
    public static VarHandle pfCancel$VH() {
        return COPYFILE2_EXTENDED_PARAMETERS.pfCancel$VH;
    }
    public static MemoryAddress pfCancel$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)COPYFILE2_EXTENDED_PARAMETERS.pfCancel$VH.get(seg);
    }
    public static void pfCancel$set( MemorySegment seg, MemoryAddress x) {
        COPYFILE2_EXTENDED_PARAMETERS.pfCancel$VH.set(seg, x);
    }
    public static MemoryAddress pfCancel$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)COPYFILE2_EXTENDED_PARAMETERS.pfCancel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfCancel$set(MemorySegment seg, long index, MemoryAddress x) {
        COPYFILE2_EXTENDED_PARAMETERS.pfCancel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pProgressRoutine$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pProgressRoutine"));
    public static VarHandle pProgressRoutine$VH() {
        return COPYFILE2_EXTENDED_PARAMETERS.pProgressRoutine$VH;
    }
    public static MemoryAddress pProgressRoutine$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)COPYFILE2_EXTENDED_PARAMETERS.pProgressRoutine$VH.get(seg);
    }
    public static void pProgressRoutine$set( MemorySegment seg, MemoryAddress x) {
        COPYFILE2_EXTENDED_PARAMETERS.pProgressRoutine$VH.set(seg, x);
    }
    public static MemoryAddress pProgressRoutine$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)COPYFILE2_EXTENDED_PARAMETERS.pProgressRoutine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pProgressRoutine$set(MemorySegment seg, long index, MemoryAddress x) {
        COPYFILE2_EXTENDED_PARAMETERS.pProgressRoutine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PCOPYFILE2_PROGRESS_ROUTINE pProgressRoutine (MemorySegment segment, MemorySession session) {
        return PCOPYFILE2_PROGRESS_ROUTINE.ofAddress(pProgressRoutine$get(segment), session);
    }
    static final VarHandle pvCallbackContext$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("pvCallbackContext"));
    public static VarHandle pvCallbackContext$VH() {
        return COPYFILE2_EXTENDED_PARAMETERS.pvCallbackContext$VH;
    }
    public static MemoryAddress pvCallbackContext$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)COPYFILE2_EXTENDED_PARAMETERS.pvCallbackContext$VH.get(seg);
    }
    public static void pvCallbackContext$set( MemorySegment seg, MemoryAddress x) {
        COPYFILE2_EXTENDED_PARAMETERS.pvCallbackContext$VH.set(seg, x);
    }
    public static MemoryAddress pvCallbackContext$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)COPYFILE2_EXTENDED_PARAMETERS.pvCallbackContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvCallbackContext$set(MemorySegment seg, long index, MemoryAddress x) {
        COPYFILE2_EXTENDED_PARAMETERS.pvCallbackContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


