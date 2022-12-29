import moment from "moment";
import { Moment } from "moment/moment";

function padTo2Digits(num: number) {
  return num.toString().padStart(2, "0");
}

export function convertDateToAmPm(date: Date): string {
  return date.toLocaleTimeString("en-US", {
    hour: "2-digit",
    minute: "2-digit",
  });
}
