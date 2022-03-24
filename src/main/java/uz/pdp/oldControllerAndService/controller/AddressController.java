package uz.pdp.oldControllerAndService.controller;

// Nurkulov Nodirbek 3/24/2022  6:47 AM
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/address")
public class AddressController {
//
//    private final AddressService addressService;
//
//    @GetMapping
//    public HttpEntity<?> getAllAddresses(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
//        List<Address> addresses = addressService.getAddresses(page, size);
//        return ResponseEntity.ok(addresses);
//    }
//
//    @GetMapping("/{id}")
//    public HttpEntity<?> getAddress(@PathVariable Integer id) {
//        Address address = addressService.getAddress(id);
//        return ResponseEntity.status(address != null ? HttpStatus.OK : HttpStatus.CONFLICT).body(address);
//    }
//
//    @PostMapping
//    public HttpEntity<?> addAddress(@RequestBody Address address) {
//        Address savedAddress = addressService.addAddress(address);
//        return ResponseEntity.status(201).body(savedAddress);
//    }
//
//    @PutMapping("/{id}")
//    public HttpEntity<?> editAddress(@PathVariable Integer id, @RequestBody Address address) {
//        Address editedAddress = addressService.editAddress(id, address);
//        return ResponseEntity.status(editedAddress != null ? HttpStatus.ACCEPTED : HttpStatus.CONFLICT).body(editedAddress);
//    }
//
//    @DeleteMapping("/{id}")
//    public HttpEntity<?> deleteAddress(@PathVariable Integer id) {
//        boolean deleted = addressService.deleteAddress(id);
//        if (deleted)
//            return ResponseEntity.noContent().build();//204 no content yani ochirganda qaytariladi doim
//        return ResponseEntity.notFound().build();//404 not found
//    }
}
