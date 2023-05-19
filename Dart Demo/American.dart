import 'Person.dart';

class American extends Person {
  String middleName;

  American(String firstName, this.middleName, String lastName)
      : super(firstName, lastName);

  @override
  void printInfo() {
    super.printInfo();
    print(middleName);
  }
}
