// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class tagDRAWITEMSTRUCT {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG$LAYOUT.withName("CtlType"),
        Constants$root.C_LONG$LAYOUT.withName("CtlID"),
        Constants$root.C_LONG$LAYOUT.withName("itemID"),
        Constants$root.C_LONG$LAYOUT.withName("itemAction"),
        Constants$root.C_LONG$LAYOUT.withName("itemState"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("hwndItem"),
        Constants$root.C_POINTER$LAYOUT.withName("hDC"),
        MemoryLayout.structLayout(
            Constants$root.C_LONG$LAYOUT.withName("left"),
            Constants$root.C_LONG$LAYOUT.withName("top"),
            Constants$root.C_LONG$LAYOUT.withName("right"),
            Constants$root.C_LONG$LAYOUT.withName("bottom")
        ).withName("rcItem"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("itemData")
    ).withName("tagDRAWITEMSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagDRAWITEMSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle CtlType$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CtlType"));
    public static VarHandle CtlType$VH() {
        return tagDRAWITEMSTRUCT.CtlType$VH;
    }
    public static int CtlType$get(MemorySegment seg) {
        return (int)tagDRAWITEMSTRUCT.CtlType$VH.get(seg);
    }
    public static void CtlType$set( MemorySegment seg, int x) {
        tagDRAWITEMSTRUCT.CtlType$VH.set(seg, x);
    }
    public static int CtlType$get(MemorySegment seg, long index) {
        return (int)tagDRAWITEMSTRUCT.CtlType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlType$set(MemorySegment seg, long index, int x) {
        tagDRAWITEMSTRUCT.CtlType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CtlID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("CtlID"));
    public static VarHandle CtlID$VH() {
        return tagDRAWITEMSTRUCT.CtlID$VH;
    }
    public static int CtlID$get(MemorySegment seg) {
        return (int)tagDRAWITEMSTRUCT.CtlID$VH.get(seg);
    }
    public static void CtlID$set( MemorySegment seg, int x) {
        tagDRAWITEMSTRUCT.CtlID$VH.set(seg, x);
    }
    public static int CtlID$get(MemorySegment seg, long index) {
        return (int)tagDRAWITEMSTRUCT.CtlID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlID$set(MemorySegment seg, long index, int x) {
        tagDRAWITEMSTRUCT.CtlID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemID$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemID"));
    public static VarHandle itemID$VH() {
        return tagDRAWITEMSTRUCT.itemID$VH;
    }
    public static int itemID$get(MemorySegment seg) {
        return (int)tagDRAWITEMSTRUCT.itemID$VH.get(seg);
    }
    public static void itemID$set( MemorySegment seg, int x) {
        tagDRAWITEMSTRUCT.itemID$VH.set(seg, x);
    }
    public static int itemID$get(MemorySegment seg, long index) {
        return (int)tagDRAWITEMSTRUCT.itemID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemID$set(MemorySegment seg, long index, int x) {
        tagDRAWITEMSTRUCT.itemID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemAction$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemAction"));
    public static VarHandle itemAction$VH() {
        return tagDRAWITEMSTRUCT.itemAction$VH;
    }
    public static int itemAction$get(MemorySegment seg) {
        return (int)tagDRAWITEMSTRUCT.itemAction$VH.get(seg);
    }
    public static void itemAction$set( MemorySegment seg, int x) {
        tagDRAWITEMSTRUCT.itemAction$VH.set(seg, x);
    }
    public static int itemAction$get(MemorySegment seg, long index) {
        return (int)tagDRAWITEMSTRUCT.itemAction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemAction$set(MemorySegment seg, long index, int x) {
        tagDRAWITEMSTRUCT.itemAction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemState$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemState"));
    public static VarHandle itemState$VH() {
        return tagDRAWITEMSTRUCT.itemState$VH;
    }
    public static int itemState$get(MemorySegment seg) {
        return (int)tagDRAWITEMSTRUCT.itemState$VH.get(seg);
    }
    public static void itemState$set( MemorySegment seg, int x) {
        tagDRAWITEMSTRUCT.itemState$VH.set(seg, x);
    }
    public static int itemState$get(MemorySegment seg, long index) {
        return (int)tagDRAWITEMSTRUCT.itemState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemState$set(MemorySegment seg, long index, int x) {
        tagDRAWITEMSTRUCT.itemState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndItem$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hwndItem"));
    public static VarHandle hwndItem$VH() {
        return tagDRAWITEMSTRUCT.hwndItem$VH;
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagDRAWITEMSTRUCT.hwndItem$VH.get(seg);
    }
    public static void hwndItem$set( MemorySegment seg, MemoryAddress x) {
        tagDRAWITEMSTRUCT.hwndItem$VH.set(seg, x);
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagDRAWITEMSTRUCT.hwndItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndItem$set(MemorySegment seg, long index, MemoryAddress x) {
        tagDRAWITEMSTRUCT.hwndItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDC$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("hDC"));
    public static VarHandle hDC$VH() {
        return tagDRAWITEMSTRUCT.hDC$VH;
    }
    public static MemoryAddress hDC$get(MemorySegment seg) {
        return (java.lang.foreign.MemoryAddress)tagDRAWITEMSTRUCT.hDC$VH.get(seg);
    }
    public static void hDC$set( MemorySegment seg, MemoryAddress x) {
        tagDRAWITEMSTRUCT.hDC$VH.set(seg, x);
    }
    public static MemoryAddress hDC$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemoryAddress)tagDRAWITEMSTRUCT.hDC$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDC$set(MemorySegment seg, long index, MemoryAddress x) {
        tagDRAWITEMSTRUCT.hDC$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcItem$slice(MemorySegment seg) {
        return seg.asSlice(40, 16);
    }
    static final VarHandle itemData$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("itemData"));
    public static VarHandle itemData$VH() {
        return tagDRAWITEMSTRUCT.itemData$VH;
    }
    public static long itemData$get(MemorySegment seg) {
        return (long)tagDRAWITEMSTRUCT.itemData$VH.get(seg);
    }
    public static void itemData$set( MemorySegment seg, long x) {
        tagDRAWITEMSTRUCT.itemData$VH.set(seg, x);
    }
    public static long itemData$get(MemorySegment seg, long index) {
        return (long)tagDRAWITEMSTRUCT.itemData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemData$set(MemorySegment seg, long index, long x) {
        tagDRAWITEMSTRUCT.itemData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, MemorySession session) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session); }
}


